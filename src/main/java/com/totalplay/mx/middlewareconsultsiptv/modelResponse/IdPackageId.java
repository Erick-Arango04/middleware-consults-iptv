package com.totalplay.mx.middlewareconsultsiptv.modelResponse;

import javax.validation.constraints.NotBlank;

public class IdPackageId {

    @NotBlank
    private String id_package;

    public IdPackageId() {
    }

    public IdPackageId(String id_package) {
        this.id_package = id_package;
    }

    public void setId_package(String id_package) {
        this.id_package = id_package;
    }

    public String getId_package() {
        return id_package;
    }
    
}
