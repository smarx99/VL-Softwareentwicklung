class LearningGroup:
    def __init__(self, *students):
        self.studentList = []

    def __str__(self):
        return str([str(student) for student in self.studentList])

    def __add__(self, other):
        new_group = LearningGroup()
        new_group.studentList = self.studentList.copy()
        new_group.studentList.append(other)
        return new_group


class Student:
    def __init__(self, name, matNr):
        self.name = name
        self.matNr = matNr

    def __str__(self):
        return self.name + ' ' + str(self.matNr)

    def __add__(self, other):
        group = LearningGroup()
        group.studentList.append(self)
        group.studentList.append(other)
        return group


if __name__ == '__main__':
    student1 = Student('Alice Wonderland', 42424242)
    student2 = Student('Bob Miller', 1564153)
    student3 = Student('Charly Robert', 4681398)

    group = student1 + student2
    group = group + student3
    group2 = student1 + student2 + student3

    print(group)
    print(group2)
