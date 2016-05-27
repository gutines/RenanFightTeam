package br.com.parametros;

import javax.management.Query;

import hibernate.HibernateUtil;
import model.Statusgeral;

import org.hibernate.Session;

public class StatusGeralDAO extends HibernateUtil {

	Session sessao;

	public StatusGeralDAO() {
		sessao = getSessionFactory().openSession();
		sessao.beginTransaction();
	}

	public Statusgeral statusAtivo() {

		org.hibernate.Query q = sessao
				.createQuery(HqlStatusGeralEnum.CONSULTAR_STATUS_ATIVO
						.getHqlStatusGeral());

		return (Statusgeral) q.uniqueResult();
	}

	public Statusgeral statusInativo() {

		org.hibernate.Query q = sessao
				.createQuery(HqlStatusGeralEnum.CONSULTAR_STATUS_INATIVO
						.getHqlStatusGeral());

		return (Statusgeral) q.uniqueResult();
	}
}
