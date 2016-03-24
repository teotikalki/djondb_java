/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package djondb;

public class BSONObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BSONObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BSONObj obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        djonwrapperJNI.delete_BSONObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BSONObj() {
    this(djonwrapperJNI.new_BSONObj__SWIG_0(), true);
  }

  public BSONObj(BSONObj orig) {
    this(djonwrapperJNI.new_BSONObj__SWIG_1(BSONObj.getCPtr(orig), orig), true);
  }

  public void add(String arg0, int arg1) {
    djonwrapperJNI.BSONObj_add__SWIG_0(swigCPtr, this, arg0, arg1);
  }

  public void add(String arg0, double arg1) {
    djonwrapperJNI.BSONObj_add__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public void add(String arg0, long arg1) {
    djonwrapperJNI.BSONObj_add__SWIG_2(swigCPtr, this, arg0, arg1);
  }

  public void add(String arg0, String arg1) {
    djonwrapperJNI.BSONObj_add__SWIG_3(swigCPtr, this, arg0, arg1);
  }

  public void add(String arg0, String arg1, int arg2) {
    djonwrapperJNI.BSONObj_add__SWIG_4(swigCPtr, this, arg0, arg1, arg2);
  }

  public void add(String arg0, BSONObj arg1) {
    djonwrapperJNI.BSONObj_add__SWIG_5(swigCPtr, this, arg0, BSONObj.getCPtr(arg1), arg1);
  }

  public void add(String arg0, BSONArrayObj arg1) {
    djonwrapperJNI.BSONObj_add__SWIG_6(swigCPtr, this, arg0, BSONArrayObj.getCPtr(arg1), arg1);
  }

  public void add(String arg0, SWIGTYPE_p_BSONContent arg1) {
    djonwrapperJNI.BSONObj_add__SWIG_7(swigCPtr, this, arg0, SWIGTYPE_p_BSONContent.getCPtr(arg1));
  }

  public void add(String arg0, boolean arg1) {
    djonwrapperJNI.BSONObj_add__SWIG_8(swigCPtr, this, arg0, arg1);
  }

  public boolean has(String arg0) {
    return djonwrapperJNI.BSONObj_has(swigCPtr, this, arg0);
  }

  public boolean getBoolean(String arg0) {
    return djonwrapperJNI.BSONObj_getBoolean(swigCPtr, this, arg0);
  }

  public int getInt(String arg0) {
    return djonwrapperJNI.BSONObj_getInt(swigCPtr, this, arg0);
  }

  public double getDouble(String arg0) {
    return djonwrapperJNI.BSONObj_getDouble(swigCPtr, this, arg0);
  }

  public long getLong(String arg0) {
    return djonwrapperJNI.BSONObj_getLong(swigCPtr, this, arg0);
  }

  public String getString(String arg0) {
    return djonwrapperJNI.BSONObj_getString(swigCPtr, this, arg0);
  }

  public BSONObj getBSON(String arg0) {
    long cPtr = djonwrapperJNI.BSONObj_getBSON(swigCPtr, this, arg0);
    return (cPtr == 0) ? null : new BSONObj(cPtr, false);
  }

  public BSONArrayObj getBSONArray(String arg0) {
    long cPtr = djonwrapperJNI.BSONObj_getBSONArray(swigCPtr, this, arg0);
    return (cPtr == 0) ? null : new BSONArrayObj(cPtr, false);
  }

  public SWIGTYPE_p_BSONContent get(String arg0) {
    long cPtr = djonwrapperJNI.BSONObj_get(swigCPtr, this, arg0);
    return (cPtr == 0) ? null : new SWIGTYPE_p_BSONContent(cPtr, false);
  }

  public SWIGTYPE_p_BSONContent getContent(String arg0) {
    long cPtr = djonwrapperJNI.BSONObj_getContent__SWIG_0(swigCPtr, this, arg0);
    return (cPtr == 0) ? null : new SWIGTYPE_p_BSONContent(cPtr, false);
  }

  public SWIGTYPE_p_BSONContent getContent(String arg0, SWIGTYPE_p_BSONTYPE arg1) {
    long cPtr = djonwrapperJNI.BSONObj_getContent__SWIG_1(swigCPtr, this, arg0, SWIGTYPE_p_BSONTYPE.getCPtr(arg1));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BSONContent(cPtr, false);
  }

  public SWIGTYPE_p_BSONContent getXpath(String xpath) {
    long cPtr = djonwrapperJNI.BSONObj_getXpath(swigCPtr, this, xpath);
    return (cPtr == 0) ? null : new SWIGTYPE_p_BSONContent(cPtr, false);
  }

  public BSONObj select(String sel) {
    long cPtr = djonwrapperJNI.BSONObj_select__SWIG_0(swigCPtr, this, sel);
    return (cPtr == 0) ? null : new BSONObj(cPtr, false);
  }

  public BSONObj select(String sel, boolean includeKey) {
    long cPtr = djonwrapperJNI.BSONObj_select__SWIG_1(swigCPtr, this, sel, includeKey);
    return (cPtr == 0) ? null : new BSONObj(cPtr, false);
  }

  public SWIGTYPE_p_BSONTYPE type(String arg0) {
    return new SWIGTYPE_p_BSONTYPE(djonwrapperJNI.BSONObj_type(swigCPtr, this, arg0), true);
  }

  public String toChar() {
    return djonwrapperJNI.BSONObj_toChar(swigCPtr, this);
  }

  public SWIGTYPE_p_std__mapT_std__string_BSONContent_p_t__const_iterator begin() {
    return new SWIGTYPE_p_std__mapT_std__string_BSONContent_p_t__const_iterator(djonwrapperJNI.BSONObj_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_BSONContent_p_t__const_iterator end() {
    return new SWIGTYPE_p_std__mapT_std__string_BSONContent_p_t__const_iterator(djonwrapperJNI.BSONObj_end(swigCPtr, this), true);
  }

  public int length() {
    return djonwrapperJNI.BSONObj_length(swigCPtr, this);
  }

  public int compare(BSONObj other) {
    return djonwrapperJNI.BSONObj_compare(swigCPtr, this, BSONObj.getCPtr(other), other);
  }

  public void remove(String kkey) {
    djonwrapperJNI.BSONObj_remove(swigCPtr, this, kkey);
  }

}
