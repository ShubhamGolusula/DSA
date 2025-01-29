console.log(this); // Window object is the default context

// A context of a function is the value of "this" for that function 
//     -- i.e. the object the function is called as a method of.
// To create a new context create a class and instantiate the class

class Person {
    constructor(name, type) {
        this.name = name;
        this.type = type;
    }
    greet() {
        console.log(`Hello, my name is ${this.name}`);
    }
}

class Player extends Person{
    constructor(name, type) {
        super(name,type)
    }
    play(){
        console.log(`${this.name} is a ${this.type} player`);
    }
}

const player1 = new Player("Shubham","Basketball");
const player2 = new Player("Chintu","Football");