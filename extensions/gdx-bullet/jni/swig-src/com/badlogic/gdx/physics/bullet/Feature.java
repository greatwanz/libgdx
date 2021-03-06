/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class Feature extends Element {
  private long swigCPtr;

  protected Feature(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.Feature_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Feature obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_Feature(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_material(Material value) {
    gdxBulletJNI.Feature_m_material_set(swigCPtr, this, Material.getCPtr(value), value);
  }

  public Material getM_material() {
    long cPtr = gdxBulletJNI.Feature_m_material_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Material(cPtr, false);
  }

  public Feature() {
    this(gdxBulletJNI.new_Feature(), true);
  }

}
