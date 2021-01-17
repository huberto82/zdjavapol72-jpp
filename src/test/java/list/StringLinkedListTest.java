package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLinkedListTest {
    @Test
    public void shouldReturnTrueForIsEmptyForNewList(){
        StringLinkedList list = new StringLinkedList();
        boolean result = list.isEmpty();
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseForIsEmptyForListWithItems(){
        StringLinkedList list = new StringLinkedList();
        list.add("TEST");
        boolean result = list.isEmpty();
        assertFalse(result);
    }

    @Test
    public void shouldReturnValidValueForGet(){
        StringLinkedList list = new StringLinkedList();
        list.add("TEST");
        assertEquals("TEST", list.get(0));
        assertNull(list.get(1));
        for(int i = 0; i < 100; i++){
            list.add("SSSS");
        }
        assertEquals("SSSS", list.get(100));
        assertNull(list.get(101));
    }

    @Test
    public void shouldReturnValidSize(){
        StringLinkedList list = new StringLinkedList();
        assertEquals(0, list.size());
        list.add("AAA");
        assertEquals(1, list.size());
        list.add("BBB");
        list.add("CCC");
        assertEquals(3, list.size());
        list.add("DDD");
        assertEquals(4, list.size());
    }
}