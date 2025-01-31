class MyArray{
    constructor(){
        this.length = 0;
        this.data = {};
    }
    get(index){
        return this.data[index];
    }
    push(item){
        this.data[this.length] = item;
        this.length++;
    }
    pop(){
        const last = this.data[this.length-1];
        delete this.data[this.length-1];
        this.length--;
        return last;
    }

    delete(index){
        if(index < 0 || index >= this.length) return null;
        const item = this.data[index];
        this.shiftItems(index);
        this.pop()
        return item;
    }
    shiftItems(index){
        if(index < 0 || index >= this.length) return null;
        for (let i = index; i < this.length-1; i++) {
            this.data[i] = this.data[i+1]
         }
    }
}

const arr = new MyArray();
arr.push("hello");
arr.push("world");
arr.push("!!");
arr.pop();
arr.delete(0)
console.log(arr)