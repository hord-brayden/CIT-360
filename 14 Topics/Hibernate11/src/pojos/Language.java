package pojos;
// Generated Dec 7, 2018 12:11:45 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Language generated by hbm2java
 */
public class Language  implements java.io.Serializable {


     private byte languageId;
     private String name;
     private Date lastUpdate;
     private Set filmsForLanguageId = new HashSet(0);
     private Set filmsForOriginalLanguageId = new HashSet(0);

    public Language() {
    }

	
    public Language(byte languageId, String name, Date lastUpdate) {
        this.languageId = languageId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }
    public Language(byte languageId, String name, Date lastUpdate, Set filmsForLanguageId, Set filmsForOriginalLanguageId) {
       this.languageId = languageId;
       this.name = name;
       this.lastUpdate = lastUpdate;
       this.filmsForLanguageId = filmsForLanguageId;
       this.filmsForOriginalLanguageId = filmsForOriginalLanguageId;
    }
   
    public byte getLanguageId() {
        return this.languageId;
    }
    
    public void setLanguageId(byte languageId) {
        this.languageId = languageId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set getFilmsForLanguageId() {
        return this.filmsForLanguageId;
    }
    
    public void setFilmsForLanguageId(Set filmsForLanguageId) {
        this.filmsForLanguageId = filmsForLanguageId;
    }
    public Set getFilmsForOriginalLanguageId() {
        return this.filmsForOriginalLanguageId;
    }
    
    public void setFilmsForOriginalLanguageId(Set filmsForOriginalLanguageId) {
        this.filmsForOriginalLanguageId = filmsForOriginalLanguageId;
    }




}


