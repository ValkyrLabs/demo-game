import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Address, AddressAddressTypeEnum,  } from '../../../model';
import { useAddAddressMutation } from '../../services/AddressService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2025-01-03T16:22:47.869548-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Address
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const AddressTypeValidation = () => { 
  return(
    [
      'home', 'mail', 'work', 'school', 'other', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     name: Yup.string()
    
    
    .required('name is required.')
    
    ,
     street1: Yup.string()
    
    
    .required('street1 is required.')
    
    ,
     city: Yup.string()
    
    
    .required('city is required.')
    
    ,
     state: Yup.string()
    
    
    .required('state is required.')
    
    ,
     postalCode: Yup.string()
    
    
    .required('postalCode is required.')
    
    .matches( /^\\d{5}-\\d{4}$/, 'postalCode must match the provided pattern 5+4 digit zip code' ),
    hasWifi: Yup.boolean()
    
    .oneOf([true], "The hasWifi value must be true.")
    
    
    ,
     principalId: Yup.string()
    
    
    
    
    ,
     addressType: Yup.string().oneOf(AddressTypeValidation(), 'Invalid value selected for addressType')
    
    
    
    
    ,
     street2: Yup.string()
    
    
    
    
    ,
     country: Yup.string()
    
    
    
    
    ,
     id: Yup.string()
    
    
    
    
    ,
     ownerId: Yup.string()
    
    
    
    
    ,
     createdDate: Yup.date()
    
    
    
    
    ,
     keyHash: Yup.string()
    
    
    
    
    ,
     lastAccessedById: Yup.string()
    
    
    
    
    ,
     lastAccessedDate: Yup.date()
    
    
    
    
    ,
     lastModifiedById: Yup.string()
    
    
    
    
    ,
     lastModifiedDate: Yup.date()
    
    
    
    
    ,

});

const AddressForm: React.FC = () => {
  const [addAddress, addAddressResult] = useAddAddressMutation();

  const initialValues: Address = {
    
    
    name : 'Henry Johnson',
    
    
    
    
    
    
    
    street1 : '123 Daydream Blvd.',
    
    
    
    
    
    
    
    city : 'San Francisco',
    
    
    
    
    
    
    
    state : 'CA',
    
    
    
    
    
    
    
    postalCode : '94210-0000',
    
    
    
    
    
    
    hasWifi : undefined,
    
    
    
    
    
    
    
    
    principalId : 'null',
    
    
    
    
    
        addressType :   AddressAddressTypeEnum[Object.keys(AddressAddressTypeEnum)[0]], 
    
    
    street2 : 'Apt. 7',
    
    
    
    
    
    
    
    country : 'USA',
    
    
    
    
    
    
    
    id : '3773d666-dea1-4d02-b430-11ca52e266a8',
    
    
    
    
    
    
    
    ownerId : '5297b19d-fd2a-4007-9aef-f0b7264cd539',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : 'ef297a29-e742-4535-82c6-6ef6211bca12',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : 'ba749007-a05a-4505-a434-d92c7cf9712d',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Address>) => {
    setTimeout(() => {
      console.log(values);
      addAddress(values);
      setSubmitting(false);
    }, 500);
  }

  return (
    <div>
      <Formik
        validateOnBlur={true}
        initialValues={initialValues}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >

        {({ isSubmitting, isValid, errors, setFieldValue, touched, setFieldTouched, handleSubmit }) => (
          <form onSubmit={handleSubmit} className="form">

                    <Accordion
                      defaultActiveKey="1"
                    >
                      <Accordion.Item eventKey="0">
                        <Accordion.Header><FaCogs size={36}/></Accordion.Header>
                        <Accordion.Body>
                          errors: {JSON.stringify(errors)}
                          <br />
                          touched: {JSON.stringify(touched)}
                          <br />
                          addAddressResult: {JSON.stringify(addAddressResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Address</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="name" className="nice-form-control">
              <b>Name: {touched.name && !errors.name && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* name  TEXT FIELD */}
              <Field name="name" type="text"
                className={errors.name  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="name" component="span" />
            </label>


        
            <label htmlFor="street1" className="nice-form-control">
              <b>Street 1: {touched.street1 && !errors.street1 && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* street1  TEXT FIELD */}
              <Field name="street1" type="text"
                className={errors.street1  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="street1" component="span" />
            </label>


        
            <label htmlFor="city" className="nice-form-control">
              <b>City: {touched.city && !errors.city && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* city  TEXT FIELD */}
              <Field name="city" type="text"
                className={errors.city  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="city" component="span" />
            </label>


        
            <label htmlFor="state" className="nice-form-control">
              <b>State: {touched.state && !errors.state && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* state  TEXT FIELD */}
              <Field name="state" type="text"
                className={errors.state  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="state" component="span" />
            </label>


        
            <label htmlFor="postal_code" className="nice-form-control">
              <b>Postal _ code: {touched.postalCode && !errors.postalCode && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* postal_code  TEXT FIELD */}
              <Field name="postalCode" type="text"
                className={errors.postalCode  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="postalCode" component="span" />
            </label>


        
            <label htmlFor="hasWifi" className="nice-form-control">
              <b>Has Wifi: {touched.hasWifi && !errors.hasWifi && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="hasWifi"
                name="hasWifi"
                onChange={e => {
                  setFieldTouched('hasWifi', true);
                  setFieldValue('hasWifi', e.target.checked);
                }}
                isInvalid={!!errors.hasWifi }                  
                className={errors.hasWifi  ? 'error ' : ''} />
              <ErrorMessage className='error' name="hasWifi" component="span" />
            </label>


        
            <label htmlFor="principalId" className="nice-form-control">
              <b>Principal Id: {touched.principalId && !errors.principalId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* principalId  TEXT FIELD */}
              <Field name="principalId" type="text"
                className={errors.principalId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="principalId" component="span" />
            </label>


        
            <label htmlFor="addressType" className="nice-form-control">
              <b>Address Type: {touched.addressType && !errors.addressType && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="addressType"
                className={errors.addressType ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('addressType', true);
                  setFieldValue('addressType', e.target.value);
                }}
              >
                <option value="" label="Select Address Type" />
                <AddressTypeLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="addressType" component="span" />
            </label>


        
            <label htmlFor="street2" className="nice-form-control">
              <b>Street 2: {touched.street2 && !errors.street2 && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* street2  TEXT FIELD */}
              <Field name="street2" type="text"
                className={errors.street2  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="street2" component="span" />
            </label>


        
            <label htmlFor="country" className="nice-form-control">
              <b>Country: {touched.country && !errors.country && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* country  TEXT FIELD */}
              <Field name="country" type="text"
                className={errors.country  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="country" component="span" />
            </label>


        
            <label htmlFor="id" className="nice-form-control">
              <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* id  TEXT FIELD */}
              <Field name="id" type="text"
                className={errors.id  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="id" component="span" />
            </label>


        
            <label htmlFor="ownerId" className="nice-form-control">
              <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* ownerId  TEXT FIELD */}
              <Field name="ownerId" type="text"
                className={errors.ownerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="ownerId" component="span" />
            </label>


        
            <label htmlFor="createdDate" className="nice-form-control">
              <b>Created Date: {touched.createdDate && !errors.createdDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*createdDate DATE FIELD */}
              <Field name="createdDate" type="date"
                className={errors.createdDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="createdDate" component="span" />
            </label>


        
            <label htmlFor="keyHash" className="nice-form-control">
              <b>Key Hash: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* keyHash  TEXT FIELD */}
              <Field name="keyHash" type="text"
                className={errors.keyHash  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="keyHash" component="span" />
            </label>


        
            <label htmlFor="lastAccessedById" className="nice-form-control">
              <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastAccessedById  TEXT FIELD */}
              <Field name="lastAccessedById" type="text"
                className={errors.lastAccessedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastAccessedById" component="span" />
            </label>


        
            <label htmlFor="lastAccessedDate" className="nice-form-control">
              <b>Last Accessed Date: {touched.lastAccessedDate && !errors.lastAccessedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastAccessedDate DATE FIELD */}
              <Field name="lastAccessedDate" type="date"
                className={errors.lastAccessedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastAccessedDate" component="span" />
            </label>


        
            <label htmlFor="lastModifiedById" className="nice-form-control">
              <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastModifiedById  TEXT FIELD */}
              <Field name="lastModifiedById" type="text"
                className={errors.lastModifiedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastModifiedById" component="span" />
            </label>


        
            <label htmlFor="lastModifiedDate" className="nice-form-control">
              <b>Last Modified Date: {touched.lastModifiedDate && !errors.lastModifiedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastModifiedDate DATE FIELD */}
              <Field name="lastModifiedDate" type="date"
                className={errors.lastModifiedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastModifiedDate" component="span" />
            </label>

 
<br /><br />

                    <CoolButton
                      variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
                      type="submit"
                      onClick={() => { }}
                    >
                      {isSubmitting && (
                        <Spinner
                          style={ { float: "left" } }
                          as="span"
                          animation="grow"
                          variant="light"
                          aria-hidden="true"
                        />
                      )}
                      <FaCheckCircle size={30} /> Create New Address
                    </CoolButton>


                        </Accordion.Body>
                      </Accordion.Item>
                    </Accordion>

          </form>
        )}
    </Formik>
    </div >
  );
};

/*

lowercase addresstypelookup
uppercase ADDRESSTYPELOOKUP
snakecase address_type_lookup
pascalcase AddressTypeLookup
camelcase addressTypeLookup
kebabcase address-type-lookup


*/

const AddressTypeLookup = () => { 
  return(
  <>
    
    <option value='home' label='Home' />
    
    
    <option value='mail' label='Mail' />
    
    
    <option value='work' label='Work' />
    
    
    <option value='school' label='School' />
    
    
    <option value='other' label='Other' />
    
  </>
  )
};






export default AddressForm;
