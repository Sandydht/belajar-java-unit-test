package belajar.java.testing.service;

import belajar.java.testing.data.Person;
import belajar.java.testing.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    public void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    public void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.get("Person not found"));
    }

    @Test
    public void testGetPersonSuccess() {
        Mockito.when(personRepository.selectById("sandy")).thenReturn(new Person("sandy", "Sandy"));
        var person = personService.get("sandy");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("sandy", person.getId());
        Assertions.assertEquals("Sandy", person.getName());
    }

    @Test
    public void testCreatePersonSuccess() {
        var person = personService.register("Sandy");
        Assertions.assertEquals("Sandy", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1)).insert(new Person(person.getId(), person.getName()));
    }
}
