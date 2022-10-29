package com.domain.bootstrap;

import com.domain.entity.Customer;
import com.domain.entity.Merchant;
import com.domain.entity.Payment;
import com.domain.entity.PaymentDetail;
import com.domain.enums.Status;
import com.domain.repository.CustomerRepository;
import com.domain.repository.MerchantRepository;
import com.domain.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;
    private final CustomerRepository customerRepository;


    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, CustomerRepository customerRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Payment payment1 = new Payment(new BigDecimal("150000"), LocalDate.of(2022,4,19), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal("140000"),new BigDecimal("10000"),LocalDate.of(2022,4,24));

        payment1.setPaymentDetail(paymentDetail1);

        Payment payment2 = new Payment(new BigDecimal("100000"), LocalDate.of(2022,4,25), Status.FAILURE);
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal("90000"),new BigDecimal("5000"),LocalDate.of(2022,4,29));

        payment2.setPaymentDetail(paymentDetail2);

        Merchant merchant1 = new Merchant("AmazonSubMerchant","M123",new BigDecimal("0.25"),new BigDecimal("3.25"),5);

        Customer customer1=new Customer("Mike", "Smith", "mike@gmail.com", "Harvest Ln", "mkie");


        payment1.setCustomer(customer1);
        payment2.setCustomer(customer1);



        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        customerRepository.save(customer1);

        merchantRepository.save(merchant1);



        paymentRepository.save(payment1);
        paymentRepository.save(payment2);


    }
}
