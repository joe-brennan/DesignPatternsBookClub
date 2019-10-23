package Observer;

import org.junit.jupiter.api.Test;

class ObserverTest {

    Subject underTest = new Subject();
    BinaryObserver observer = new BinaryObserver(underTest);

    @Test
    void testObserversListening() {
        underTest.setState(5);
    }
}