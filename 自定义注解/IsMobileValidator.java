package seckill_system.validator;

import seckill_system.util.ValidatorUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Demo IsMobileValidator
 *
 * @author root
 * @date 2019/12/21
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile,String>{

    private boolean required = false;
    @Override
    public void initialize(IsMobile constraintAnnotation) {

        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if (required){
            return ValidatorUtil.validator_mobile(s);
        }else{
            return false;
        }
    }
}

