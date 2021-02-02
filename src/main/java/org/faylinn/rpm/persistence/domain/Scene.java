package org.faylinn.rpm.persistence.domain;

import javax.persistence.Table;

/**
 * @author Faylinn
 * @since 2021/2/2 22:07
 */
@Table(name = "scene")
public class Scene {
    private Long id;
    private String sceneId;
    private String sceneName;
    private String sceneIntroduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getSceneIntroduction() {
        return sceneIntroduction;
    }

    public void setSceneIntroduction(String sceneIntroduction) {
        this.sceneIntroduction = sceneIntroduction;
    }
}
