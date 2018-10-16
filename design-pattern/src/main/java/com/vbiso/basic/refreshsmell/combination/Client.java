package com.vbiso.basic.refreshsmell.combination;

import com.vbiso.basic.refreshsmell.combination.impl.FolderFileImpl;
import com.vbiso.basic.refreshsmell.combination.impl.ImgFileImpl;
import com.vbiso.basic.refreshsmell.combination.impl.TextFileImpl;
import com.vbiso.basic.refreshsmell.combination.impl.VideoFileImpl;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:53 2018/10/16
 * @Modified By:
 */
public class Client {


  public static void main(String[] args){
    FileInterface textFolder,ImageFolder,videoFolder,vbisoFolder;
    textFolder=new FolderFileImpl("文本资料");
    ImageFolder=new FolderFileImpl("图像资料");
    videoFolder=new FolderFileImpl("视频资料");
    vbisoFolder=new FolderFileImpl("vbsio的资料");
    vbisoFolder.add(textFolder);
    vbisoFolder.add(ImageFolder);
    vbisoFolder.add(videoFolder);
    FileInterface fil1=new ImgFileImpl("Image1");
    FileInterface fil2=new ImgFileImpl("Image2");
    FileInterface fil3=new ImgFileImpl("Image3");
    ImageFolder.add(fil1);
    ImageFolder.add(fil2);
    ImageFolder.add(fil3);
    FileInterface tFile1=new TextFileImpl("text1");
    FileInterface tFile2=new TextFileImpl("text2");
    FileInterface tFile3=new TextFileImpl("text3");
    textFolder.add(tFile1);
    textFolder.add(tFile2);
    textFolder.add(tFile3);
    FileInterface vFile1=new VideoFileImpl("video1");
    FileInterface vFile2=new VideoFileImpl("video2");
    FileInterface vFile3=new VideoFileImpl("video3");
    vbisoFolder.add(vFile1);
    vbisoFolder.add(vFile2);
    vbisoFolder.add(vFile3);
    vbisoFolder.killVirus();
  }

}
