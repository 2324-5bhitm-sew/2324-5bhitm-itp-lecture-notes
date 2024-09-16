package at.htlleonding.airways.control;

import at.htlleonding.airways.entity.Customer;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class CustomerRepositoryTest {

    @Inject
    CustomerRepository customerRepository;

    @Test
    @Transactional
    void createCustomer() {
        Customer customer = new Customer("Moser", "Hans");
        customerRepository.persist(customer);
    }

    @Test
    @Transactional
    void givenACustomerWithExistingFirstAndLastname_whenPersisting_thenFails() {
        var actualCustomer1 = new Customer("Newman", "Paul");
        var actualCustomer2 = new Customer("Newman", "Paul");

        customerRepository.persist(actualCustomer1);
        customerRepository.persist(actualCustomer2);

    }
}