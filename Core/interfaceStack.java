interface Two_Methods {
  void push(int x);

  int pop();

  void disp();
}

class Stack implements Two_Methods {
  int arr[] = new int[5];
  int top = -1;

  public void push(int item) {
    if (top == 4) {
      System.out.println("Overflow");
      return;
    }
    top++;
    arr[top] = item;
  }

  public int pop() {
    if (top == -1) {
      System.out.println("underflow");
      return -1;
    }
    int item = arr[top];
    top--;
    return item;
  }

  public void disp() {
    for (int i = top; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }
}

public class interfaceStack {
  public static void main(String[] args) {
    Stack s1 = new Stack();
    s1.pop();
    for (int i = 0; i < 5; i++) {
      s1.push(i + 100);
    }
    s1.push(600);
    System.out.println("Displaying all items");
    s1.disp();// non interface methods
    System.out.println("Removing all items");
    for (int i = 0; i < 5; i++) {
      System.out.println(s1.pop());// -1 for underflow

    }
    Two_Methods t1 = new Stack();
    t1.push(10);
    System.out.println(t1.pop());
    t1.disp();
    System.out.println("matrix".length());
  }
}
