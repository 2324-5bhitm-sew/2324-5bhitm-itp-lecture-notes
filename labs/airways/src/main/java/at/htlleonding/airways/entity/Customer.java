package at.htlleonding.airways.entity;


import jakarta.persistence.*;

@Entity
@Table(name="A_CUSTOMER", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"C_LAST_NAME", "C_FIRST_NAME"})
})
@SequenceGenerator(
        name = "custSeq",
        sequenceName = "A_CUST_SEQ",
        initialValue = 1000,
        allocationSize = 1
)
public class Customer {

    @Id @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "custSeq"
    )
    @Column(name = "C_ID")
    private Long id;

    @Column(name="C_LAST_NAME")
    private String lastName;

    @Column(name="C_FIRST_NAME")
    private String firstName;


    public Customer() {
    }

    public Customer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return String.format("$d: %s, %s", id, lastName, firstName);
    }
}
