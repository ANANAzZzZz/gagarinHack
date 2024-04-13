package org.example.toworkspring.services

import lombok.RequiredArgsConstructor
import org.example.toworkspring.models.Module
import org.example.toworkspring.models.Track
import org.example.toworkspring.models.Usersprogress
import org.example.toworkspring.repositories.*
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class TrackService(
    private val trackRepository: TrackRepository,
    private val moduleRepository: ModuleRepository,
    private val pageRepository: PageRepository,
    private val userProgressRepository: UserProgressRepository,
    private val userRepository: UserRepository
) {

    fun getAllTracks(page: Int, pageSize: Int): MutableIterable<Track> {
        return trackRepository.findAll()
    }

    fun getModulesInTrack(idTrack: Int): List<Module> {
        return moduleRepository.getModulesByIdtrack_IdEquals(idTrack.toLong())
    }

    fun getPagesInModules(numberModule: Long, idTrack: Long) =
        pageRepository.getPages(numberModule.toInt(), idTrack.toInt())

    fun updateProgress(idUser: Int, idTrack: Int, numberModule: Int, numberPage: Int) {
        val usersProgress = userProgressRepository.findProgress(idUser, idTrack, numberModule)
        if (usersProgress != null){
            usersProgress.numberlastcompletepage = numberPage
            userProgressRepository.save(usersProgress)
        } else {
            val module = moduleRepository.findById_IdtrackAndId_Numberintrack(idTrack, numberModule)
            println("module: $module")
            userProgressRepository.save(
                Usersprogress(
                    userRepository.getById(idUser.toLong()).also { println("user: $it") },
                    module,
                    numberPage,
                    module.quantitypages
                )
            )
        }
    }
}