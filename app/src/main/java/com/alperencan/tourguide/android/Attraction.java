package com.alperencan.tourguide.android;

/**
 * {@link Attraction} represents an attraction location that the user would like to visit.
 * It contains resource IDs for title, address, and optional image file for that attraction.
 */

public class Attraction {

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
     * Create a new Attraction object.
     *
     * @param titleId   is the string resource ID for the attraction title
     * @param addressId is the string resource ID for the attraction address
     */
    public Attraction(int titleId, int addressId) {
        this.titleId = titleId;
        this.addressId = addressId;
    }

    /**
     * Create a new Attraction object.
     *
     * @param titleId         is the string resource ID for the attraction title
     * @param addressId       is the string resource ID for the attraction address
     * @param imageResourceId is the resource ID for the image associated with the attraction
     */
    public Attraction(int titleId, int addressId, int imageResourceId) {
        this(titleId, addressId);
        this.imageResourceId = imageResourceId;
    }

    public int getTitleId() {
        return titleId;
    }

    public int getAddressId() {
        return addressId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
