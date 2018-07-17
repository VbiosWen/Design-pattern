package com.vbiso.basic.refreshsmell.protoType.complex;

import com.vbiso.basic.refreshsmell.protoType.complex.impl.FarDocument;
import com.vbiso.basic.refreshsmell.protoType.complex.impl.SarDocument;
import java.util.HashMap;
import org.jetbrains.annotations.Contract;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午8:19 2018/7/17
 * @Modified By:
 */
public class ProtoTypeManager {

  private  HashMap<String,OfficialDocument> hashMap=new HashMap<>();

  private static ProtoTypeManager protoTypeManager=new ProtoTypeManager();

  private ProtoTypeManager() {
    hashMap.put("far",new FarDocument());
    hashMap.put("sar",new SarDocument());
  }
  public void addOfficialDocument(String key,OfficialDocument doc){
    hashMap.put(key,doc);
  }

  public OfficialDocument getOfficialDocument(String key){
    return hashMap.get(key).clone();
  }

  @Contract(pure = true)
  public static ProtoTypeManager getProtoTypeManager() {
    return protoTypeManager;
  }
}
