import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /* Creating a Stack
         Verem létrehozása
        */
        Stack<Character> stack = new Stack<>();

        /* Tests if this stack is empty.
         Ellenőrzi, hogy ez a verem üres-e.
        */
        System.out.println(stack+"\nStack is empty: "+stack.isEmpty());

        /* Pushes an item onto the top of this stack.
         Ennek a vermenek a tetejére tol egy elemet.
        */
        for (int i = 65; i < 70; i++) {
            stack.push((char)i);
        }
        System.out.println(stack+"\nStack is empty: "+stack.isEmpty());

        /* Removes the object at the top of this stack and returns that object as the value of this function.
         Eltávolítja a verem tetején lévő objektumot, és ezt az objektumot a függvény értékeként adja vissza.
        */
        System.out.println("\n"+stack);
        System.out.println("pop(): "+stack.pop());
        System.out.println(stack);

        /* Looks at the object at the top of this stack without removing it from the stack.
         A verem tetején lévő objektumot nézi anélkül, hogy eltávolítaná a veremből.
        */
        System.out.println("\n"+stack);
        System.out.println("peek(): "+stack.peek());
        System.out.println(stack);

        /* Returns the 1-based position where an object is on this stack.
         Visszaadja az elem helyzetét a verem tetejéről.
        */
        System.out.println("\n"+stack);
        System.out.println("search(W): "+stack.search('W'));
        System.out.println("search(A): "+stack.search('A'));
        System.out.println("search(D): "+stack.search('D'));
    }
}
