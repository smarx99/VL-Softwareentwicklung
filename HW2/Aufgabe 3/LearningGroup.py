class LearningGroup:
    def __init__(self, *students):
        self.studentList = list(students)

    def __str__(self):
        return str([str(student) for student in self.studentList])

    def __add__(self, other):
        self.studentList.append(other)
        return self
        #if isinstance(other, Student):
        #   self.studentList.append(other)
        #  return self
        #elif isinstance(other, LearningGroup):
        #    return LearningGroup(*(self.studentList + other.studentList))


class Student:
    def __init__(self, name, matNr):
        self.name = name
        self.matNr = matNr

    def __str__(self):
        return self.name + ' ' + str(self.matNr)

    def __add__(self, other):
        return LearningGroup(self, other)
        #if isinstance(other, Student):
        #    return LearningGroup(self, other)



if __name__ == '__main__':
    student1 = Student('Alice Wonderland', 42424242)
    student2 = Student('Bob Miller', 1564153)
    student3 = Student('Charly Robert', 4681398)

    group = student1 + student2
    group = group + student3
    group2 = student1 + student2 + student3

    print(group)
    print(group2)

# Given the above, what is the outcome of student1 + student2 + student3? Give a stepby-
# step explanation of your answer.

# group = student1 + student2:
# This creates a new LearningGroup object containing student1 and student2. "group" now refers to this newly created
# LearningGroup object.
# group = group + student3:
# The __add__ method of the LearningGroup class is called, which creates a new LearningGroup object containing
# student1, student2, and student3. The variable group is then updated to refer to this new LearningGroup object.

# group2 = student1 + student2 + student3:
# This adds student1 and student2 together, which results in a new LearningGroup object containing student1 and student2.
# Then, it adds student3 to this LearningGroup object, which creates another LearningGroup object containing
# student1, student2, and student3.

