package com.main.test.util;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName NeoProperties
 * @Author WangLu
 * @Date 2019/1/29
 **/
public class NeoProperties {

    @Value("${title}")
    public String title;

    @Value("${description}")
    public String description;

    private NeoProperties(Builder builder) {
        setTitle(builder.title);
        setDescription(builder.description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final class Builder {
        private String title;
        private String description;

        public Builder() {
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public NeoProperties build() {
            return new NeoProperties(this);
        }
    }

}
