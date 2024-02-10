import java.util.Set;

public interface NodeVisitationHandler {
    
    void handle(Node currentNode, Set<Integer> previousVisitedNodes);
}
