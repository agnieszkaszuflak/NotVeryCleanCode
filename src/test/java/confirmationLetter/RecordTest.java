package confirmationLetter;

import domain.Record;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RecordTest {

    @Test
    void testIsCounterTranferRecordTrue() {
        Record record = new Record();
        record.setIsCounterTransferRecord(Integer.valueOf(1));
        assertTrue(record.isCounterTransferRecord());
    }

    @Test
    void testIsCounterTranferRecordNotTrue() {
        Record record = new Record();
        record.setIsCounterTransferRecord(Integer.valueOf(0));
        assertFalse(record.isCounterTransferRecord());
    }

    @Test
    void testhasFeeTrue() {
        Record record = new Record();
        record.setFeeRecord(Integer.valueOf(1));
        assertTrue(record.hasFee());
    }

    @Test
    void testhasFeeFalse() {
        Record record = new Record();
        record.setFeeRecord(Integer.valueOf(0));
        assertFalse(record.hasFee());
    }

}