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
    private val userRepository: UserRepository,
    private val knowledgeRepository: KnowledgeRepository
) {

    fun getAllTracks(page: Int, pageSize: Int): MutableIterable<Track> {
        return trackRepository.findAll()
    }

    fun getModulesInTrack(idTrack: Int): List<Module> {
        return moduleRepository.getModulesByIdtrack_IdEquals(idTrack.toLong())
    }

    fun getPagesInModules(numberModule: Long, idTrack: Long) =
        pageRepository.getPages(numberModule.toInt(), idTrack.toInt())

    fun updateProgress(idUser: Int, idTrack: Int, numberModule: Int, numberPage: Int): Map<String, String> {
        val usersProgress = userProgressRepository.findProgress(idUser, idTrack, numberModule)

        try {
            if (usersProgress != null) {
                usersProgress.numberlastcompletepage = numberPage
                userProgressRepository.save(usersProgress)
            } else {
                val module = moduleRepository.findById_IdtrackAndId_Numberintrack(idTrack, numberModule)
                userProgressRepository.save(
                    Usersprogress(
                        userRepository.getById(idUser.toLong()),
                        module,
                        numberPage,
                        module.quantitypages
                    )
                )
            }
            return hashMapOf("message" to "success")
        } catch (e: Exception) {
            return hashMapOf("message" to e.message.orEmpty())
        }
    }

    fun getListKnowledge() = knowledgeRepository.findAll().toList()
}