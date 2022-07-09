package edu.mum.cs.cs425.elibrary.service.impl;

import edu.mum.cs.cs425.elibrary.model.Publisher;
import edu.mum.cs.cs425.elibrary.repository.PublisherRepository;
import edu.mum.cs.cs425.elibrary.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {
    private PublisherRepository publisherRepository;

//    @Autowired -- Not needed for SpringBoot v2+
    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher addNewPublisher(Publisher publisher) {
        var newPublisher = publisherRepository.save(publisher);
        return newPublisher;
    }

    @Override
    public List<Publisher> getAllPublishers() {
        var publishers = publisherRepository.findAll(Sort.by("name"));
        return publishers;
    }

    @Override
    public Publisher getPublisherById(Integer publisherId) {
        return publisherRepository.findById(publisherId)
                .orElse(null);
    }

    @Override
    public Publisher updatePublisher(Publisher updatedPublisher) {
        return publisherRepository.save(updatedPublisher);
    }

    @Override
    public void deletePublisherById(Integer publisherId) {
        publisherRepository.deleteById(publisherId);
    }
}
