package main.utils;

import main.entity.AbstractResume;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 7/2/20 12:31 PM
 */
public class Valid {
  public static boolean ValidResumeAllFields(AbstractResume resume){
    if(resume.getId() == null || resume.getId().equals("")){
      return false;
    }
    if(resume.getName() == null || resume.getName().equals("")){
      return false;
    }
    if(resume.getSchool() == null || resume.getSchool().equals("")){
      return false;
    }
    if(resume.getProcess() == null){
      return false;
    }
    return true;
  }
}
