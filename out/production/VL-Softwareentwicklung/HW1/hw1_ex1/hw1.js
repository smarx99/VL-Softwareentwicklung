let alice = {
    firstName: "Alice",
    lastName: "Wonderland",
    age: 24,
    getName: function () {
        return `${this.firstName} ${this.lastName}`;
    }
};

let roleProf = {
    __proto__: alice,
    chair: "Computer Science",
    level: "W1",
    position: "full professor",
    getDescription() {
        return `${this.getName()} is a Professor at the ${this.chair} chair.`
    },
    getInfo() {
        return `${this.getDescription()} The professor level is ${this.level} and the position kind is ${this.position}.`;
    }
};

let roleHeadExamination = {
    __proto__: roleProf,
    title: "Head of the Examination Board",
    getInfo() {
        return `${super.getInfo()} The title is ${this.title}.`;
    },
    getDescription() {
        return `${super.getDescription()}`;
    }
};

let roleHeadDepartment = {
    __proto__: roleProf,
    title: "Head of the Department",
    getInfo() {
        return `${super.getInfo()} The title is ${this.title}.`;
    },
    getDescription() {
        return `${super.getDescription()}`;
    }
};

console.log(roleHeadExamination.getInfo());
console.log(roleHeadDepartment.getInfo());