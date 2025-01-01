import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Border, BorderStyleEnum, BorderColorEnum,  } from '../../../model';
import { useAddBorderMutation } from '../../services/BorderService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Border
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const StyleValidation = () => { 
  return(
    [
      'None', 'Thin', 'Medium', 'Dashed', 'Dotted', 'Thick', 'Double', 'Hair', 'MediumDashed', 'DashDot', 'MediumDashDot', 'DashDotDot', 'MediumDashDotDot', 'SlantedDashDot', 
    ]
  )
};

const ColorValidation = () => { 
  return(
    [
      'Black', 'Red', 'Blue', 'Yellow', 'Green', 'Teal', 'Gray50', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     formatId: Yup.string()
    
    
    
    
    ,
     style: Yup.string().oneOf(StyleValidation(), 'Invalid value selected for style')
    
    
    
    
    ,
     color: Yup.string().oneOf(ColorValidation(), 'Invalid value selected for color')
    
    
    
    
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

const BorderForm: React.FC = () => {
  const [addBorder, addBorderResult] = useAddBorderMutation();

  const initialValues: Border = {
    
    
    formatId : 'null',
    
    
    
    
    
        style :   BorderStyleEnum[Object.keys(BorderStyleEnum)[0]], 
        color :   BorderColorEnum[Object.keys(BorderColorEnum)[0]], 
    
    
    id : '66890424-5881-4ae5-9858-756b5511bd8b',
    
    
    
    
    
    
    
    ownerId : '8187d29b-61c4-495b-8d9d-22c37db459a6',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : '6a4b4991-d226-4cba-b106-0db14df79ae1',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : '6fdd80bc-3137-45da-9e78-d289ec110b9b',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Border>) => {
    setTimeout(() => {
      console.log(values);
      addBorder(values);
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
                          addBorderResult: {JSON.stringify(addBorderResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Border</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="formatId" className="nice-form-control">
              <b>Format Id: {touched.formatId && !errors.formatId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* formatId  TEXT FIELD */}
              <Field name="formatId" type="text"
                className={errors.formatId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="formatId" component="span" />
            </label>


        
            <label htmlFor="style" className="nice-form-control">
              <b>Style: {touched.style && !errors.style && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="style"
                className={errors.style ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('style', true);
                  setFieldValue('style', e.target.value);
                }}
              >
                <option value="" label="Select Style" />
                <StyleLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="style" component="span" />
            </label>


        
            <label htmlFor="color" className="nice-form-control">
              <b>Color: {touched.color && !errors.color && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="color"
                className={errors.color ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('color', true);
                  setFieldValue('color', e.target.value);
                }}
              >
                <option value="" label="Select Color" />
                <ColorLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="color" component="span" />
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
                      <FaCheckCircle size={30} /> Create New Border
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

lowercase stylelookup
uppercase STYLELOOKUP
snakecase style_lookup
pascalcase StyleLookup
camelcase styleLookup
kebabcase style-lookup


*/

const StyleLookup = () => { 
  return(
  <>
    
    <option value='None' label='Border None' />
    
    
    <option value='Thin' label='Border Thin' />
    
    
    <option value='Medium' label='Border Medium' />
    
    
    <option value='Dashed' label='Border Dashed' />
    
    
    <option value='Dotted' label='Border Dotted' />
    
    
    <option value='Thick' label='Border Thick' />
    
    
    <option value='Double' label='Border Double' />
    
    
    <option value='Hair' label='Border Hair' />
    
    
    <option value='MediumDashed' label='Border Medium Dashed' />
    
    
    <option value='DashDot' label='Border Dash Dot' />
    
    
    <option value='MediumDashDot' label='Border Medium Dash Dot' />
    
    
    <option value='DashDotDot' label='Border Dash Dot Dot' />
    
    
    <option value='MediumDashDotDot' label='Border Medium Dash Dot Dot' />
    
    
    <option value='SlantedDashDot' label='Border Slanted Dash Dot' />
    
  </>
  )
};



/*

lowercase colorlookup
uppercase COLORLOOKUP
snakecase color_lookup
pascalcase ColorLookup
camelcase colorLookup
kebabcase color-lookup


*/

const ColorLookup = () => { 
  return(
  <>
    
    <option value='Black' label='Color Black' />
    
    
    <option value='Red' label='Color Red' />
    
    
    <option value='Blue' label='Color Blue' />
    
    
    <option value='Yellow' label='Color Yellow' />
    
    
    <option value='Green' label='Color Green' />
    
    
    <option value='Teal' label='Color Teal' />
    
    
    <option value='Gray50' label='Color Gray 50' />
    
  </>
  )
};






export default BorderForm;
