package com.elfangor1989.FreeLiveView.messages.calls;
//Added by RN+
//NOT TESTED

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

import com.elfangor1989.FreeLiveView.messages.LiveViewCall;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

public class DisplayText extends LiveViewCall {

    private String text;

    public DisplayText(String text) {
        super(MessageConstants.MSG_DISPLAYTEXT);
        this.text = text;
    }

    /*
     * (non-Javadoc)
     * @see net.sourcewalker.olv.messages.LiveViewRequest#getPayload()
     */
    @Override
    protected byte[] getPayload() {
        try {
            byte[] textArray = text.getBytes("iso-8859-1");
            int size = 3 + textArray.length; //1 + 2 (disabled)
            ByteBuffer buffer = ByteBuffer.allocate(size);
            buffer.put((byte) 0);
            buffer.putShort((short) textArray.length);
            buffer.put(textArray);
            return buffer.array();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not found: " + e.getMessage(),
                    e);
        }
    }
}
