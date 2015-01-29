package org.apache.harmony.security.asn1;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;

public abstract class ASN1TypeCollection extends ASN1Constructed {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:51.290 -0500", hash_original_field = "2C1BBE312A31324DECE23D8C64DF5B3B", hash_generated_field = "24AC453E9AFABA0FC5B4FCBCBDACD1C1")

    public  ASN1Type[] type;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:51.293 -0500", hash_original_field = "65E889FE2B8D3B64FB19BF66D9D096C9", hash_generated_field = "1BA87DFAEE4319F98EF6412C37781A6A")

    public  boolean[] OPTIONAL;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:51.295 -0500", hash_original_field = "A7694C18ECD619627FF52ACF5FBFC5AA", hash_generated_field = "F208B7C91C0EC690D5447FD30675E5BF")

    public  Object[] DEFAULT;

    /**
     * Constructs ASN.1 collection type.
     *
     * @param tagNumber ASN.1 tag number
     * @param type a collection of one or more ASN.1 types.
     * @throws IllegalArgumentException if tagNumber is invalid
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:51.298 -0500", hash_original_method = "2D9B8BA6B8763CB3A447E57286A5B8E0", hash_generated_method = "3D635612048F22BB2D25888CFD2E4ED7")
    
protected ASN1TypeCollection(int tagNumber, ASN1Type[] type) {
        super(tagNumber);
        this.type = type;
        this.OPTIONAL = new boolean[type.length];
        this.DEFAULT = new Object[type.length];
    }

    /**
     * Sets a collection component as optional
     *
     * @param index an index of a component
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:51.300 -0500", hash_original_method = "2E3FD069D2ECECC280341BA5C6DB58FF", hash_generated_method = "F64B06F21619E23FE78DD9B837603DCE")
    
protected final void setOptional(int index) {
        OPTIONAL[index] = true;
    }

    /**
     * Sets a default value for a collection component.
     * The component also became an optional component.
     *
     * @param object a component's default value
     * @param index an index of a component
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:51.303 -0500", hash_original_method = "5DD4202D21937C15AEFBE0B59FE742F3", hash_generated_method = "3ED90754402DD1E33F82B9178BC7A3AC")
    
protected final void setDefault(Object object, int index) {
        OPTIONAL[index] = true;
        DEFAULT[index] = object;
    }

    /**
     * Provides an object's values to be encoded
     *
     * Derived classes should override this method to provide
     * encoding for a selected class of objects.
     *
     * The default implementation throws RuntimeException.
     *
     * @param object an object to be encoded
     * @param values an array to store an object's values to be encoded
     */
    @DSSource({DSSourceKind.SENSITIVE_UNCATEGORIZED})
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:00:51.305 -0500", hash_original_method = "C805E3FBD50230AA52139BF018AC9872", hash_generated_method = "1381A8646BAF43F4BD28D076CEA1B8E5")
    
protected void getValues(Object object, Object[] values) {
        throw new RuntimeException("ASN.1 type is not designed to be encoded: " + getClass().getName());
    }
    
}
