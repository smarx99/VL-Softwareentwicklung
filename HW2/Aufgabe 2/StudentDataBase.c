#include<stdio.h>
#include<stdlib.h>
#include<string.h>

//TODO: Add struct Student
struct Student{
    char* name;
    int matNr;
};

//TODO: Add struct StudentDataBase
struct StudentDataBase{
    struct Student* data;
    int size;
};

int addStudentsToDataBase(struct StudentDataBase* sDB) {
    for(int i = 0; i < sDB->size; i++) {
        printf("\nPlease enter the students name: ");
        char string[41];
        scanf("%40s", string);
        sDB->data[i].name = strdup(string);

        printf("\nPlease enter the students matriculation number: ");
        scanf("%d", &(sDB->data[i].matNr));
    }

    return 0;
}

void printStudentDB(struct StudentDataBase* sDB) {
    for(int i = 0; i < sDB->size; i++) {
        printf("\nName: %s, matNr: %d", sDB->data[i].name, sDB->data[i].matNr);
    }
}

void deleteStudentDB(struct StudentDataBase* sDB) {
    if(sDB != NULL) {
        if(sDB->data != NULL) {
            for(int i = 0; i < sDB->size; i++) {
                //TODO: Free student name
                free(sDB->data[i].name);
            }
            //TODO: Free data field of Student Database
            free(sDB->data);
        }
        //TODO: Free Database
        free(sDB);
    }
}

int main(int argc, char** argv) {
    int number = 0;
    printf("Please enter how many students you want to store: ");
    scanf("%d", &number);

    //TODO: Allocate memory for Student Database
    //struct StudentDataBase* sDB = malloc(sizeof(struct StudentDataBase));
    struct StudentDataBase* sDB = (struct StudentDataBase*) malloc(sizeof(struct StudentDataBase*));
    if(sDB != NULL) {
        //TODO: Allocate memory for data field
        //sDB->data = malloc(number * sizeof(struct Student));
        sDB->data = (struct Student*) malloc(number * sizeof(struct Student*));
        if(sDB->data != NULL) {
            sDB->size = number;

            addStudentsToDataBase(sDB);
            printStudentDB(sDB);

            deleteStudentDB(sDB);
        }
    }

    return 0;
}
