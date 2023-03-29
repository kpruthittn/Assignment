package Question3;

public class SpecialStack{
    int top=-1,stack[],size,min[],temp=-1;
    SpecialStack(int size){
        this.size=size;
        stack=new int[size];
        min=new int[size];
    }
    void push(int number){
        if(top==size-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++top]=number;
        System.out.println("Number is added: " + number);
        if(temp==-1 || number<=min[temp]){
            min[++temp]=number;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else {
            System.out.println("Number is removed: " + stack[top]);
            int num = stack[top--];
            if(num==min[temp]){
                temp--;
            }
        }
    }
    boolean isEmpty(){
        if(top==-1) return true;
        else return false;
    }
    boolean isFull(){
        if(top==(size-1)) return true;
        else return false;
    }
    void getMin(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Minimum value in Stack is: " + min[temp]);
        }
    }
}
