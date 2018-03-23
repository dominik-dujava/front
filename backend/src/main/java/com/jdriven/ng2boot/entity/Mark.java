package com.jdriven.ng2boot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Mark.
 */
@Entity
@Table(name = "mark")
public class Mark implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "main_image_src")
    private String mainImageSrc;

    @Column(name = "description")
    private String description;

    @Column(name = "favourite")
    private Boolean favourite;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "mark_id")
    private Set<Images> markImages = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "mark_id")
    private Set<Texts> textFields = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Mark title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainImageSrc() {
        return mainImageSrc;
    }

    public Mark mainImageSrc(String mainImageSrc) {
        this.mainImageSrc = mainImageSrc;
        return this;
    }

    public void setMainImageSrc(String mainImageSrc) {
        this.mainImageSrc = mainImageSrc;
    }

    public String getDescription() {
        return description;
    }

    public Mark description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isFavourite() {
        return favourite;
    }

    public Mark favourite(Boolean favourite) {
        this.favourite = favourite;
        return this;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public Set<Images> getMarkImages() {
        return markImages;
    }

    public Mark markImages(Set<Images> images) {
        this.markImages = images;
        return this;
    }

    public Mark addMarkImages(Images images) {
        this.markImages.add(images);
//        images.setMark(this.id);
        return this;
    }

    public Mark removeMarkImages(Images images) {
        this.markImages.remove(images);
//        images.setMark(null);
        return this;
    }

    public void setMarkImages(Set<Images> images) {
        this.markImages = images;
    }

    public Set<Texts> getTextFields() {
        return textFields;
    }

    public Mark textFields(Set<Texts> texts) {
        this.textFields = texts;
        return this;
    }

    public Mark addTextFields(Texts texts) {
        this.textFields.add(texts);
        texts.setMark(this);
        return this;
    }

    public Mark removeTextFields(Texts texts) {
        this.textFields.remove(texts);
        texts.setMark(null);
        return this;
    }

    public void setTextFields(Set<Texts> texts) {
        this.textFields = texts;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mark mark = (Mark) o;
        if (mark.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), mark.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Mark{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", mainImageSrc='" + getMainImageSrc() + "'" +
            ", description='" + getDescription() + "'" +
            ", favourite='" + isFavourite() + "'" +
            "}";
    }
}
