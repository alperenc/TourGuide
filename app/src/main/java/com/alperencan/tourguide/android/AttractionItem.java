package com.alperencan.tourguide.android;

/**
 * {@AttractionItem} represents an attraction location that the user would like to visit.
 * It contains resource IDs for title, address, and optional image file for that attraction.
 */

public class AttractionItem {

    /**
     * Constant value that represents no image was provided for this attraction
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * String resource ID for the title of the attraction
     */
    private int titleId;

    /**
     * String resource ID for the address of the attraction
     */
    private int addressId;

    /**
     * Image resource ID for the attraction
     */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new AttractionItem object.
     *
     * @param titleId   is the string resource ID for the attraction title
     * @param addressId is the string resource ID for the attraction address
     */
    public AttractionItem(int titleId, int addressId) {
        this.titleId = titleId;
        this.addressId = addressId;
    }

    /**
     * Create a new AttractionItem object.
     *
     * @param titleId         is the string resource ID for the attraction title
     * @param addressId       is the string resource ID for the attraction address
     * @param imageResourceId is the resource ID for the image associated with the attraction
     */
    public AttractionItem(int titleId, int addressId, int imageResourceId) {
        this(titleId, addressId);
        this.imageResourceId = imageResourceId;
    }
}
