package tn.esprit.spring.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.repository.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@Disabled // Désactive l'exécution automatique du test
class UserServiceImplMockTest {

    @Mock
    UserRepository userRepositoryMock; // Mock du UserRepository

    @InjectMocks
    UserServiceImpl userService; // Service à tester

    @Test
    void testAddUser() {
        // Méthode de test vide pour l’instant
        assertTrue(true); // Juste un test par défaut
    }
}
