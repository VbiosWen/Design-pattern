package com.vbiso.basic.refreshsmell.facade_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 10:19 PM 2018/12/25
 * @Modified By:
 */
public class EncryptFacade {

  private FileReader fileReader;

  private FileWriter fileWriter;

  private CipherMachine cipherMachine;

  public EncryptFacade() {
    this.fileReader=new FileReader();
    this.fileWriter=new FileWriter();
    this.cipherMachine=new CipherMachine();
  }

  public void fileEncrypt(String filePath,String fileName){
    String plainStr=fileReader.read(filePath);
    String encrypt = cipherMachine.encrypt(plainStr);
    fileWriter.write(encrypt);
  }
}
