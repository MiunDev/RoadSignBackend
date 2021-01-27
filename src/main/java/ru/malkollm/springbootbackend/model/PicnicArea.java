package ru.malkollm.springbootbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "picnic_areas")
public class PicnicArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name_set")
    private String nameSet;
    @Column(name = "total_count_set")
    private String totalCountSet;
    @Column(name = "name_place_picnic")
    private String namePlacePicnic;
    @Column(name = "address_landmark")
    private String addressLandmark;
    @Column(name = "service_provider")
    private String serviceProvider;
    @Column(name = "phone")
    private String phone;
    @Column(name = "photo")
    private String photo;
    @Column(name = "geoobject_name")
    private String geoobjectName;
    @Column(name = "geocord")
    private String geocord;

    public PicnicArea() {
    }

    public PicnicArea(String nameSet, String totalCountSet, String namePlacePicnic, String addressLandmark, String serviceProvider, String phone, String photo, String geoobjectName, String geocord) {
        this.nameSet = nameSet;
        this.totalCountSet = totalCountSet;
        this.namePlacePicnic = namePlacePicnic;
        this.addressLandmark = addressLandmark;
        this.serviceProvider = serviceProvider;
        this.phone = phone;
        this.photo = photo;
        this.geoobjectName = geoobjectName;
        this.geocord = geocord;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameSet() {
        return nameSet;
    }

    public void setNameSet(String nameSet) {
        this.nameSet = nameSet;
    }

    public String getTotalCountSet() {
        return totalCountSet;
    }

    public void setTotalCountSet(String totalCountSet) {
        this.totalCountSet = totalCountSet;
    }

    public String getNamePlacePicnic() {
        return namePlacePicnic;
    }

    public void setNamePlacePicnic(String namePlacePicnic) {
        this.namePlacePicnic = namePlacePicnic;
    }

    public String getAddressLandmark() {
        return addressLandmark;
    }

    public void setAddressLandmark(String addressLandmark) {
        this.addressLandmark = addressLandmark;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGeoobjectName() {
        return geoobjectName;
    }

    public void setGeoobjectName(String geoobjectName) {
        this.geoobjectName = geoobjectName;
    }

    public String getGeocord() {
        return geocord;
    }

    public void setGeocord(String geocord) {
        this.geocord = geocord;
    }
}