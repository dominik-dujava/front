package com.jdriven.ng2boot.service.api;

import com.jdriven.ng2boot.entity.Mark;

import java.util.List;

/**
 * Service Interface for managing Mark.
 */
public interface MarkService {

    /**
     * Save a mark.
     *
     * @param mark the entity to save
     * @return the persisted entity
     */
    Mark save(Mark mark);

    /**
     * Get all the marks.
     *
     * @return the list of entities
     */
    List<Mark> findAll();

    /**
     * Get the "id" mark.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Mark findOne(Long id);

    /**
     * Delete the "id" mark.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
