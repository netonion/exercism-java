import java.util.Stack;

class BracketChecker {

    private String brackets;

    public BracketChecker(String brackets) {
        this.brackets = brackets;
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        Stack<Character> stack = new Stack<>();
        for (char c : brackets.toCharArray()) {
            switch (c) {
                case '(': stack.push(')'); break;
                case '[': stack.push(']'); break;
                case '{': stack.push('}'); break;
                case ')':
                case ']':
                case '}':
                    if (stack.empty() || stack.pop() != c)
                        return false;
            }
        }
        return stack.empty();
    }
}
