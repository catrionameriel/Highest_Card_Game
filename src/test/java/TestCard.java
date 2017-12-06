import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCard {

    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, ValueType.JACK);
    }

    @Test
    public void hasSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void hasValueType(){
        assertEquals(ValueType.JACK, card.getValue());
    }

    @Test
    public void hasValue(){
        assertEquals(11, card.getValueFromValueType());
    }


}
