package br.com.ufc.repository;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.ufc.exception.CJCException;
import br.com.ufc.exception.CNEException;
import br.com.ufc.exception.SOJCException;
import br.com.ufc.exception.SONEException;
import br.com.ufc.model.person.Client;
import br.com.ufc.model.person.Person;
import br.com.ufc.model.person.SystemOperator;


public class PersonRepository {
  private HashMap<Integer,Person> persons = new HashMap<Integer,Person>();

  public void addClient(Client client) throws CJCException {
    if (!persons.containsKey(client.getRegistration())) {
      persons.put(client.getRegistration(), client);
      return;
    }
    throw new CJCException();
  }

  public void addSystemOperator(SystemOperator systemOperator) throws SOJCException {
    if (!persons.containsKey(systemOperator.getRegistration())) {
      persons.put(systemOperator.getRegistration(), systemOperator);
      return;
    }
    throw new SOJCException();
  }

  public Person findPersonByRegistration(Integer registration) {
    return persons.get(registration);
  }

  public Client findClientByRegistration(Integer registration) throws CNEException {
    Person person = findPersonByRegistration(registration);

    if (person instanceof Client) {
      return (Client)person;
    } else {
      throw new CNEException();
    }
  }

  public SystemOperator findSystemOperatorByRegistration(Integer registration) throws SONEException {
    Person person = findPersonByRegistration(registration);

    if (person instanceof SystemOperator) {
      return (SystemOperator)person;
    } else {
      throw new SONEException();
    }
  }

  public ArrayList<Client> listClients() throws CNEException {
    ArrayList<Client> clients = new ArrayList<Client>();

    for (Person person : persons.values()) {
      if (person instanceof Client) {
        clients.add((Client)person);
      }
    }

    if (clients.isEmpty()) {
      throw new CNEException();
    }
    return clients;
  }
}
