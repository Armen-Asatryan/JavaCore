package classwork.employeemanagement.modell;

import java.util.Objects;

public class Company {
    private String id;
    private String name;
    private String adress;

    public Company(String id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }


    public Company() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (!Objects.equals(id, company.id)) return false;
        if (!Objects.equals(name, company.name)) return false;
        return Objects.equals(adress, company.adress);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
