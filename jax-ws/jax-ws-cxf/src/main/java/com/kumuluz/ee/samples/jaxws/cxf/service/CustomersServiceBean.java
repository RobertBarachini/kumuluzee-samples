/*
 *  Copyright (c) 2014-2018 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.kumuluz.ee.samples.jaxws.cxf.service;

import com.kumuluz.samples.jax_ws.cxf.customers._1.Customer;

import javax.enterprise.context.Dependent;
import java.util.Arrays;
import java.util.List;

/**
 * @author gpor89
 * @since 3.0.0
 */
@Dependent
public class CustomersServiceBean implements CustomersService {

    @Override
    public List<Customer> getCustomers() {

        Customer customer1 = new Customer();
        customer1.setId("1");
        customer1.setFirstName("John");
        customer1.setLastName("Smith");

        Customer customer2 = new Customer();
        customer2.setId("2");
        customer2.setFirstName("Cindy");
        customer2.setLastName("Doe");

        return Arrays.asList(customer1, customer2);
    }
}