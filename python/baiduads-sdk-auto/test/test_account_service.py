"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from account.api.account_service import AccountService  # noqa: E501


class TestAccountService(unittest.TestCase):
    """AccountService unit test stubs"""

    def setUp(self):
        self.api = AccountService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_account_info(self):
        """Test case for get_account_info

        """
        pass

    def test_update_account_info(self):
        """Test case for update_account_info

        """
        pass


if __name__ == '__main__':
    unittest.main()
