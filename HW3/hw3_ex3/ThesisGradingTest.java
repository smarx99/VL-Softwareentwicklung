package HW3.hw3_ex3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThesisGradingTest {

    private ThesisGrading thesisGrading;

    @BeforeEach
    void setUp() {
        thesisGrading = new ThesisGrading();
    }

    @AfterEach
    void tearDown() {
        thesisGrading = null;
    }
    
    // TC 1: grade1: 1.0, grade2: 2.0, grade3: 0.0, return: 1.5, exception: -
    @Test
    public void TC1() throws NoSuchGradeException, ThirdExaminerNeededException {
        assertEquals(1.5 , thesisGrading.calculcateFinalGrade(1.0, 2.0, 0.0));
    }

    // TC 2: grade1: 1.2, grade2: 2.0, grade3: 0.0, return: -, exception: NoSuchGradeException
    @Test
    public void TC2() {
        assertThrows(NoSuchGradeException.class, () -> {
            thesisGrading.calculcateFinalGrade(1.2, 2.0, 0.0);
        });
    }

    // TC 3: grade1: 1.0, grade2: 2.6, grade3: 0.0, return: -, exception: NoSuchGradeException
    @Test
    public void TC3() {
        assertThrows(NoSuchGradeException.class, () -> {
            thesisGrading.calculcateFinalGrade(1.0, 2.6, 0.0);
        });
    }

    // TC 4: grade1: 1.0, grade2: 3.3, grade3: 0.0, return: -, exception: ThirdExaminerNeededException
    @Test
    public void TC4() {
        assertThrows(ThirdExaminerNeededException.class, () -> {
            thesisGrading.calculcateFinalGrade(1.0, 3.3, 0.0);
        });
    }

    // TC 5: grade1: 1.0, grade2: 3.3, grade3: 2.0, return: 1.5, exception: -
    @Test
    public void TC5() throws NoSuchGradeException, ThirdExaminerNeededException {
        assertEquals(1.5 , thesisGrading.calculcateFinalGrade(1.0, 3.3, 2.0));
    }
}