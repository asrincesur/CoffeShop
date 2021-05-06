package Entities;

import Abstract.IEntity;

import java.time.LocalDate;

public class Customer implements IEntity
{


    int Id;
    String FirtsName;
    String LastName;
    String NationalityID;
    LocalDate BirthDate;

    public Customer(int id, String firtsName, String lastName, String nationalityID, LocalDate birthDate) {
        setId(id);
        setFirtsName(firtsName);
        setLastName(lastName);
        setNationalityID(nationalityID);
        setBirthDate(birthDate);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirtsName() {
        return FirtsName;
    }

    public void setFirtsName(String firtsName) {
        FirtsName = firtsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNationalityID() {
        return NationalityID;
    }

    public void setNationalityID(String nationalityID) {
        NationalityID = nationalityID;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }






}
