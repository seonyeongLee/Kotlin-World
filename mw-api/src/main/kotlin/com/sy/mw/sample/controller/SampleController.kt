package com.sy.mw.sample.controller

import com.sy.mw.sample.service.SampleService
import org.springframework.web.bind.annotation.*

@RequestMapping("/sample")
@RestController
class SampleController(
    private val sampleService: SampleService
) {
    @GetMapping
    fun getSamples() = sampleService.getSamples()

    @PostMapping
    fun insertSample(@RequestBody sampleRequest: SampleRequest) = sampleService.insertSample(sampleRequest.name)

    @PutMapping(path = ["/{sampleId}"])
    fun updateSample(@PathVariable("sampleId") sampleId: Long) = sampleService.updateSample(sampleId)

    @DeleteMapping(path = ["/{sampleId}"])
    fun deleteSample(@PathVariable("sampleId") sampleId: Long) = sampleService.deleteSample(sampleId)

}