package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.po.Address;

/**
 * @author cjbi
 */
@RestController
@RequestMapping("/admin/address")
public class AdminAddressController extends BaseCrudController<Address> {

}