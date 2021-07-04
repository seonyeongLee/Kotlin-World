package com.sy.mw.sample.service

import com.sy.mw.sample.repository.Sample
import com.sy.mw.sample.repository.SampleRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val sampleRepository: SampleRepository
) {
    fun getSamples() = sampleRepository.findAll()

    fun insertSample(name: String): Sample = sampleRepository.save(Sample(name = name))

    fun updateSample(sampleId: Long): Sample {
        val sample = sampleRepository.findByIdOrNull(sampleId) ?: throw Exception()
        sample.completed = !sample.completed
        return sampleRepository.save(sample)
    }

    fun deleteSample(sampleId: Long) = sampleRepository.deleteById(sampleId)
}