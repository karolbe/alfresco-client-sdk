package com.alfresco.client.api.core.model.representation;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kbryd on 6/1/2018.
 */
public class ClassPropertiesRepresentation {
    @SerializedName("name")
    private String name;

    @SerializedName("title")
    private String title;

    @SerializedName("dataType")
    private String dataType;

    @SerializedName("description")
    private String description;

    @SerializedName("defaultValue")
    private String defaultValue;

    @SerializedName("multiValued")
    private String multiValued;

    @SerializedName("mandatory")
    private String mandatory;

    @SerializedName("enforced")
    private String enforced;

    @SerializedName("protected")
    private String _protected;

    @SerializedName("indexed")
    private String indexed;

    @SerializedName("url")
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    public String getMultiValued() {
        return multiValued;
    }

    public void setMultiValued(String multiValued) {
        this.multiValued = multiValued;
    }

    public String getEnforced() {
        return enforced;
    }

    public void setEnforced(String enforced) {
        this.enforced = enforced;
    }

    public String getProtected() {
        return _protected;
    }

    public void setProtected(String _protected) {
        this._protected = _protected;
    }

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ClassPropertiesRepresentation{" +
                "    name: \"" + name + "\"" +
                "    title: \"" + title + "\"" +
                "    dataType: \"" + dataType + "\"" +
                "    description: \"" + description + "\"" +
                "    defaultValue: \"" + defaultValue + "\"" +
                "    mandatory: \"" + mandatory + "\"" +
                "    enforced: \"" + enforced + "\"" +
                "    _protected: \"" + _protected + "\"" +
                "    indexed: \"" + indexed + "\"" +
                "    url: \"" + url + "\"" +
                "}";
    }
}

