package dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Named;

import entity.Uczelnia;

@Named
@Stateless
@LocalBean
public class UczelniaDAO extends CrudDAO<Long, Uczelnia>{

}